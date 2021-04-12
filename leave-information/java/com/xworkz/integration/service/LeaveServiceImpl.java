package com.xworkz.integration.service;

import com.xworkz.integration.dao.LeaveDAO;
import com.xworkz.integration.dao.LeaveDAOImpl;
import com.xworkz.integration.entity.LeaveEntity;

public class LeaveServiceImpl implements LeaveService<LeaveEntity> {

	private LeaveDAO dao;

	public LeaveServiceImpl() {
		this.dao = new LeaveDAOImpl();
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(LeaveEntity entity) {

		boolean valid = false;
		String name = entity.getName();

		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
			System.out.println("name is valid");
			valid = true;
		} else {
			System.out.println("Name is not valid");
			valid = false;
		}

		if (valid) {

			String email = entity.getEmail();
			if (email != null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")) {
				System.out.println("Email is valid");
				valid = true;
			} else {
				System.out.println("Email is not valid");
				valid = false;
			}
		}

		if (valid) {
			String num = entity.getNum();
			if (num != null && !num.isEmpty() && num.length() == 10) {
				System.out.println(" Number is valid");
				valid = true;
			} else {
				System.out.println(" Number is not valid");
				valid = false;
			}
		}

		if (valid) {

			String reason = entity.getReason();
			if (reason != null && !reason.isEmpty() && reason.length() <= 300) {
				System.out.println("Reason is valid");
				valid = true;
			} else {
				System.out.println("Reason is not valid");
				valid = false;
			}
		}

		if (valid) {

			String date = entity.getDate();
			if (date != null && !date.isEmpty()) {
				System.out.println("Date is valid");
				valid = true;
			} else {
				System.out.println("Date is not valid");
				valid = false;
			}
		}
		if (valid) {
			this.dao.save(entity);
		}
		return valid;
	}

}