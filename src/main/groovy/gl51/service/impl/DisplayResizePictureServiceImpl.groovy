package gl51.service.impl

import gl51.data.Picture
import gl51.service.PictureService
import gl51.service.ResizePictureService

import javax.inject.Inject

/**
 * Redimentionne l'image en 1024*1024
 */
class DisplayResizePictureServiceImpl implements ResizePictureService {

    @Inject
    PictureService pictureService

    @Override
    Picture getAndResize() {
        return null
    }
}
