create index IX_68E7FA0C on FOO_Bar (field2);
create index IX_54B0F014 on FOO_Bar (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_1C1E6B96 on FOO_Bar (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_CFFD06FF on FOO_Foo (field2);
create index IX_B2FCA947 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_905CD589 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_5AAA0C17 on FOO_Foo_Bar (barId);
create index IX_5980C401 on FOO_Foo_Bar (companyId);
create index IX_45FC8B4A on FOO_Foo_Bar (fooId);