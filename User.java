package com.example.user_form.entity;



	import jakarta.persistence.*;
	import jakarta.validation.constraints.*;

	@Entity
	public class User {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank(message = "First name is required")
	    private String firstName;

	    @NotBlank(message = "Last name is required")
	    private String lastName;

	    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
	    private String phone;

	    @Email(message = "Invalid email address")
	    @NotBlank(message = "Email is required")
	    private String email;

	    @NotBlank(message = "Address is required")
	    private String address;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

	   
	
	
	
}
