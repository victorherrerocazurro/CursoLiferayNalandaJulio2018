package com.liferay.curso.search;

import com.liferay.curso.model.Foo;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Summary;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

public class FooIndexer extends BaseIndexer<Foo> {

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void doDelete(Foo object) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Document doGetDocument(Foo object) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locale, String snippet, PortletRequest portletRequest,
			PortletResponse portletResponse) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void doReindex(Foo object) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
