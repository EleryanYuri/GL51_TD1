package gl51.service.impl

import gl51.service.CloudAccessService
import gl51.service.UpdateDatabaseService

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Allow to update a database via cloud
 */

/**
 * test changement
 */

@Singleton
class CloudUpdateDatabaseServiceImpl implements UpdateDatabaseService {

    @Inject
    CloudAccessService cloudAccessService

    @Override
    Void updateDatabase() {
        return null
    }
}
