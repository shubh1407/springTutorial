package com.todoApplication.storage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.todoApplication.bean.ToDoInfo;
import com.todoApplication.bean.User;

@Repository
public class CollectionStorage {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<ToDoInfo> getListOfToDos() {

		List<ToDoInfo> todoInfos = jdbcTemplate.query("select * from todo_info", new RowMapper<ToDoInfo>() {
			@Override
			public ToDoInfo mapRow(ResultSet arg0, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				return new ToDoInfo(arg0.getInt(1), arg0.getString(2), arg0.getDate(3), arg0.getBoolean(4));
			}
		});
		return todoInfos;
	}

	public ToDoInfo getToDo(int id) {
		List<ToDoInfo> todoInfos = jdbcTemplate.query("select * from todo_info where id=?", new RowMapper<ToDoInfo>() {
			@Override
			public ToDoInfo mapRow(ResultSet arg0, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				return new ToDoInfo(arg0.getInt(1), arg0.getString(2), arg0.getDate(3), arg0.getBoolean(4));
			}
		}, new Object[] { id });
		return todoInfos.get(0);
	}

	public ToDoInfo updateTodo(ToDoInfo toDoInfo) {

		jdbcTemplate.update("update todo_info set `desc`=?,`target_date`=?,`is_done`=? where id=?",
				new Object[] { toDoInfo.getDesc(), toDoInfo.getTargetDate(), toDoInfo.isDone(), toDoInfo.getId() });
		return toDoInfo;
	}

	public void deleteToDo(int id) {

		jdbcTemplate.update("delete from todo_info where `id`=?", new Object[] { id });
	}

	public void addToDo(ToDoInfo toDoInfo) {
		jdbcTemplate.update("insert into todo_info (`desc`,`target_date`,`is_done`) values (?,?,?)",
				new Object[] { toDoInfo.getDesc(), toDoInfo.getTargetDate(), toDoInfo.isDone() });
	}

	public boolean isUserAuthorized(User user) {
		try {
			jdbcTemplate.queryForObject("select * from user_info where username=? and password=?",
					new RowMapper<User>() {
						@Override
						public User mapRow(ResultSet arg0, int arg1) throws SQLException {
							User user = new User();
							user.setUserName(arg0.getString("username"));
							user.setPassword(arg0.getString("password"));
							return user;
						}
					}, new Object[] { user.getUserName(), user.getPassword() });
		} catch (EmptyResultDataAccessException e) {
			return false;
		}
		return true;
	}
}
