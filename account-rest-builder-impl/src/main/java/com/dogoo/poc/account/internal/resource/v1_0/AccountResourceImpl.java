package com.dogoo.poc.account.internal.resource.v1_0;

import com.dogoo.poc.account.resource.v1_0.AccountResource;

import com.liferay.portal.odata.entity.EntityModel;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Administrator
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/account.properties",
	scope = ServiceScope.PROTOTYPE, service = AccountResource.class
)
public class AccountResourceImpl extends BaseAccountResourceImpl {
	@Override
	public EntityModel getEntityModel(javax.ws.rs.core.MultivaluedMap<?, ?> multivaluedMap) throws Exception {
		return null;
	}
}