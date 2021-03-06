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

package com.liferay.contacts.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntryLocalService
 * @generated
 */
public class EntryLocalServiceWrapper implements EntryLocalService,
	ServiceWrapper<EntryLocalService> {
	public EntryLocalServiceWrapper(EntryLocalService entryLocalService) {
		_entryLocalService = entryLocalService;
	}

	/**
	* Adds the entry to the database. Also notifies the appropriate model listeners.
	*
	* @param entry the entry
	* @return the entry that was added
	*/
	@Override
	public com.liferay.contacts.model.Entry addEntry(
		com.liferay.contacts.model.Entry entry) {
		return _entryLocalService.addEntry(entry);
	}

	/**
	* Creates a new entry with the primary key. Does not add the entry to the database.
	*
	* @param entryId the primary key for the new entry
	* @return the new entry
	*/
	@Override
	public com.liferay.contacts.model.Entry createEntry(long entryId) {
		return _entryLocalService.createEntry(entryId);
	}

	/**
	* Deletes the entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the entry
	* @return the entry that was removed
	* @throws PortalException if a entry with the primary key could not be found
	*/
	@Override
	public com.liferay.contacts.model.Entry deleteEntry(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _entryLocalService.deleteEntry(entryId);
	}

	/**
	* Deletes the entry from the database. Also notifies the appropriate model listeners.
	*
	* @param entry the entry
	* @return the entry that was removed
	*/
	@Override
	public com.liferay.contacts.model.Entry deleteEntry(
		com.liferay.contacts.model.Entry entry) {
		return _entryLocalService.deleteEntry(entry);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _entryLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _entryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contacts.model.impl.EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _entryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contacts.model.impl.EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return _entryLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _entryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _entryLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.contacts.model.Entry fetchEntry(long entryId) {
		return _entryLocalService.fetchEntry(entryId);
	}

	/**
	* Returns the entry with the primary key.
	*
	* @param entryId the primary key of the entry
	* @return the entry
	* @throws PortalException if a entry with the primary key could not be found
	*/
	@Override
	public com.liferay.contacts.model.Entry getEntry(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _entryLocalService.getEntry(entryId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _entryLocalService.getActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _entryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _entryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.contacts.model.impl.EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of entries
	* @param end the upper bound of the range of entries (not inclusive)
	* @return the range of entries
	*/
	@Override
	public java.util.List<com.liferay.contacts.model.Entry> getEntries(
		int start, int end) {
		return _entryLocalService.getEntries(start, end);
	}

	/**
	* Returns the number of entries.
	*
	* @return the number of entries
	*/
	@Override
	public int getEntriesCount() {
		return _entryLocalService.getEntriesCount();
	}

	/**
	* Updates the entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param entry the entry
	* @return the entry that was updated
	*/
	@Override
	public com.liferay.contacts.model.Entry updateEntry(
		com.liferay.contacts.model.Entry entry) {
		return _entryLocalService.updateEntry(entry);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _entryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_entryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _entryLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.liferay.contacts.model.Entry addEntry(long userId,
		java.lang.String fullName, java.lang.String emailAddress,
		java.lang.String comments)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entryLocalService.addEntry(userId, fullName, emailAddress,
			comments);
	}

	@Override
	public java.util.List<com.liferay.contacts.model.Entry> getEntries(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryLocalService.getEntries(userId, start, end);
	}

	@Override
	public int getEntriesCount(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryLocalService.getEntriesCount(userId);
	}

	@Override
	public java.util.List<com.liferay.contacts.model.Entry> search(
		long userId, java.lang.String keywords, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryLocalService.search(userId, keywords, start, end);
	}

	@Override
	public int searchCount(long userId, java.lang.String keywords)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryLocalService.searchCount(userId, keywords);
	}

	@Override
	public java.util.List<com.liferay.portal.model.BaseModel<?>> searchUsersAndContacts(
		long companyId, long userId, java.lang.String keywords, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _entryLocalService.searchUsersAndContacts(companyId, userId,
			keywords, start, end);
	}

	@Override
	public int searchUsersAndContactsCount(long companyId, long userId,
		java.lang.String keywords)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryLocalService.searchUsersAndContactsCount(companyId,
			userId, keywords);
	}

	@Override
	public com.liferay.contacts.model.Entry updateEntry(long entryId,
		java.lang.String fullName, java.lang.String emailAddress,
		java.lang.String comments)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entryLocalService.updateEntry(entryId, fullName, emailAddress,
			comments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	@Deprecated
	public EntryLocalService getWrappedEntryLocalService() {
		return _entryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	@Deprecated
	public void setWrappedEntryLocalService(EntryLocalService entryLocalService) {
		_entryLocalService = entryLocalService;
	}

	@Override
	public EntryLocalService getWrappedService() {
		return _entryLocalService;
	}

	@Override
	public void setWrappedService(EntryLocalService entryLocalService) {
		_entryLocalService = entryLocalService;
	}

	private EntryLocalService _entryLocalService;
}