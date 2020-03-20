package gl51.service.impl

import gl51.service.CloudAccessService

import javax.inject.Inject

/**
 * Permet l'update d'une database via cloud
 */
@Singleton
/**
 * test changement
 */


class CloudUpdateDatabaseServiceImpl implements gl51.service.UpdateDatabaseService {

    @Inject
    CloudAccessService cloudAccessService

    @Override
    Void updateDatabase() {
        return null
    }
}
