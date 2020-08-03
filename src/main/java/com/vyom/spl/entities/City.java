/**
 * 
 */
package com.vyom.spl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Entity annotation denotes that the entity is mapped to a table
 *
 */
@Entity
@Table(name = "cities")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true,doNotUseGetters = true)
public class City {
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private int population;
}
