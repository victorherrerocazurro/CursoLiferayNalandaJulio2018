package com.liferay.curso.service.persistence.impl;

import com.liferay.curso.model.Foo;
import com.liferay.curso.model.impl.FooImpl;
import com.liferay.curso.service.persistence.FooFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;

public class FooFinderImpl extends FooFinderBaseImpl implements FooFinder{

	public List<Foo> findByField1(String field1, int begin, int end) {
		Session session = null;
		try {
			session = openSession();

			String sql = CustomSQLUtil.get(getClass(), FooFinder.class.getName() + ".findByField1");

			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("FOO_Foo", FooImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(field1);

			return (List<Foo>) QueryUtil.list(q, getDialect(), begin, end);
		} catch (Exception e) {
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				se.printStackTrace();
			}
		} finally {
			closeSession(session);
		}

		return null;
	}
}
