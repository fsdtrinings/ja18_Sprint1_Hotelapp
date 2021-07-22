package com.cg.hbm.repository;

import com.cg.hbm.entites.Admin;

public interface IAdminRepository {
	public Admin signIn(Admin admin);
	public Admin signOut(Admin admin);
	
}
