package com.yashw.app.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true, exclude = {"addresses", "credential"})
@Data
@Builder
public final class User extends AbstractMappedEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false, updatable = false)
	private Integer userId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@Email(message = "*Input must be in Email format!**")
	private String email;
	
	private String phone;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
	private Set<Address> addresses;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	private Credential credential;
	
}










