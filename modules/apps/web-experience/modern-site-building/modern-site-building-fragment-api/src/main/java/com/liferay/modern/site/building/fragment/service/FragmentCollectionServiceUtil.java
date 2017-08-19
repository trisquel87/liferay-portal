/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.modern.site.building.fragment.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for FragmentCollection. This utility wraps
 * {@link com.liferay.modern.site.building.fragment.service.impl.FragmentCollectionServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see FragmentCollectionService
 * @see com.liferay.modern.site.building.fragment.service.base.FragmentCollectionServiceBaseImpl
 * @see com.liferay.modern.site.building.fragment.service.impl.FragmentCollectionServiceImpl
 * @generated
 */
@ProviderType
public class FragmentCollectionServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.modern.site.building.fragment.service.impl.FragmentCollectionServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.modern.site.building.fragment.model.FragmentCollection addFragmentCollection(
		long groupId, java.lang.String name, java.lang.String description,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addFragmentCollection(groupId, name, description,
			serviceContext);
	}

	public static com.liferay.modern.site.building.fragment.model.FragmentCollection deleteFragmentCollection(
		long fragmentCollectionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteFragmentCollection(fragmentCollectionId);
	}

	public static java.util.List<com.liferay.modern.site.building.fragment.model.FragmentCollection> deleteFragmentCollections(
		long[] fragmentCollectionIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteFragmentCollections(fragmentCollectionIds);
	}

	public static com.liferay.modern.site.building.fragment.model.FragmentCollection fetchFragmentCollection(
		long fragmentCollectionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().fetchFragmentCollection(fragmentCollectionId);
	}

	public static java.util.List<com.liferay.modern.site.building.fragment.model.FragmentCollection> getFragmentCollections(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getFragmentCollections(groupId, start, end);
	}

	public static java.util.List<com.liferay.modern.site.building.fragment.model.FragmentCollection> getFragmentCollections(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.modern.site.building.fragment.model.FragmentCollection> orderByComparator)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getFragmentCollections(groupId, start, end,
			orderByComparator);
	}

	public static java.util.List<com.liferay.modern.site.building.fragment.model.FragmentCollection> getFragmentCollections(
		long groupId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.modern.site.building.fragment.model.FragmentCollection> orderByComparator)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getFragmentCollections(groupId, name, start, end,
			orderByComparator);
	}

	public static int getGroupFragmentCollectionsCount(long groupId) {
		return getService().getGroupFragmentCollectionsCount(groupId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.modern.site.building.fragment.model.FragmentCollection updateFragmentCollection(
		long fragmentCollectionId, java.lang.String name,
		java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateFragmentCollection(fragmentCollectionId, name,
			description);
	}

	public static FragmentCollectionService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FragmentCollectionService, FragmentCollectionService> _serviceTracker =
		ServiceTrackerFactory.open(FragmentCollectionService.class);
}