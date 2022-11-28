package org.project.dto;

// DTO(Data Transfer Object)
// 계층 간 데이터 교환을 하기 위해 사용하는 객체로, 
// DTO는 로직을 가지지 않는 순수한 데이터 객체(getter & setter만 가진 클래스)이다.
public class TodoDto {
	
	// 필드
	private int todo_id;
	private String todo_todos;
	private int todo_completed;
	
	// 생성자
	public TodoDto(int todo_id, String todo_todos, int todo_completed) {
		super();
		this.todo_id = todo_id;
		this.todo_todos = todo_todos;
		this.todo_completed = todo_completed;
	}

	// getter, setter 메소드
	public int getTodo_id() {
		return todo_id;
	}

	public void setTodo_id(int todo_id) {
		this.todo_id = todo_id;
	}

	public String getTodo_todos() {
		return todo_todos;
	}

	public void setTodo_todos(String todo_todos) {
		this.todo_todos = todo_todos;
	}

	public int getTodo_completed() {
		return todo_completed;
	}

	public void setTodo_completed(int todo_completed) {
		this.todo_completed = todo_completed;
	}
}
