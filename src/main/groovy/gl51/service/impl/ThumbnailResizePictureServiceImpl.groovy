package gl51.service.impl

import gl51.data.Picture
import gl51.service.PictureService
import gl51.service.ResizePictureService

import javax.inject.Inject

/**
 * Redimentionne l'image en thumbnail et applique le watermark
 */
class ThumbnailResizePictureServiceImpl implements ResizePictureService {

    @Inject
    PictureService pictureService

    @Inject
    ApplyWatermarkServiceImpl applyWatermarkService

    @Override
    Picture getAndResize() {
        return null
    }
}
