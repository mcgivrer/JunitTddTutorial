/**
 * 
 */
package com.samples.tdd.jpa.JpaDbUnit.bean;

import java.util.List;

import com.samples.tdd.jpa.JpaDbUnit.model.Task;

/**
 * @author frederic
 *
 */
public interface TaskDao {
	public void save(Task task);
	public List<Task> list();
}
