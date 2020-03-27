package gl51.service

import gl51.data.Picture

/**
 * Permet de redimensionner une photo
 */
interface ResizePictureService {
    /**
     * recupère et redimensionne une photo
     * @return
     */
    Picture getAndResize()
}