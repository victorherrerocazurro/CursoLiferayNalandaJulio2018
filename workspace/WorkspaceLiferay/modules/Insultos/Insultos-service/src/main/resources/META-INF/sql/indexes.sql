create index IX_F22F6AD8 on Insultos_Insulto (texto[$COLUMN_LENGTH:75$]);
create index IX_F058666E on Insultos_Insulto (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_1C03B070 on Insultos_Insulto (uuid_[$COLUMN_LENGTH:75$], groupId);