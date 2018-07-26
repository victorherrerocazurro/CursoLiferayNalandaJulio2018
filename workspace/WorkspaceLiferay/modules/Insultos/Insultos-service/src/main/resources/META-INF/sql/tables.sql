create table Insultos_Insulto (
	uuid_ VARCHAR(75) null,
	insultoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	texto VARCHAR(75) null
);