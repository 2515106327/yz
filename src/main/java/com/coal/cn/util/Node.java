package com.coal.cn.util;

import java.util.List;

/**
 * 
 * @author zz
 *
 */
public class Node {
	private String id;
	private String name;
	private String pid;
	private boolean hasChildren = true;
	private List<Node> children;

	public Node() {
		// TODO Auto-generated constructor stub
	}

	public Node(String id, String name, String pid, boolean hasChildren, List<Node> children) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.hasChildren = hasChildren;
		this.children = children;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	public boolean isHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

}
