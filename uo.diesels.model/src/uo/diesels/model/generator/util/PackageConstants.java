package uo.diesels.model.generator.util;

public class PackageConstants {
		
	// Package del modelo
	public static final String MODEL_ENUM_PACKAGE = "package %s.model.enums;";
	public static final String MODEL_VALUE_TYPE_PACKAGE = "package %s.model.valueTypes;";
	public static final String MODEL_KEY_PACKAGE = "package %s.model.keys;";
	public static final String MODEL_PACKAGE = "package %s.model;";	
	
	// Package del negocio
	public static final String SERVICE_BUSINESS_PACKAGE = "package %s.business;";
	public static final String SERVICE_BUSINESS_IMPL_PACKAGE = "package %s.business.impl;";
	public static final String SERVICE_BUSINESS_IMPL_COMMAND_PACKAGE = "package %s.business.impl.%s;";	
	
	// Package de la infraestructura
	public static final String INFRASTRUCTURE_PACKAGE = "package %s.infrastructure;";
	public static final String INFRASTRUCTURE_PATH = "main/java/%s/infrastructure/%s.java";

	// Package de la persistencia
	public static final String FINDER_PERSISTENCE_PACKAGE = "package %s.persistence;";	
	
	// Package de los dto
	public static final String DTO_PACKAGE = "package %s.dto;";

}
