package com.zhiyou100.mapper;

import com.zhiyou100.model.Permission;

import java.util.List;
import java.util.Map;

public interface PermissionMapper {

	List<Permission> findAllPermission(Map<String, String> map);

	void deletePermissionById(int id);

	Permission findPermissionById(int id);

	void editPermission(Permission permission);

	void insertPermission(Permission permission);

}
