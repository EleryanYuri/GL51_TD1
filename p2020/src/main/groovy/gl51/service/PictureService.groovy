package gl51.service

import gl51.data.Picture

/**
 * Permet de recuperer une photo
 */
interface PictureService {

    /**
     * recupère une photo
     * @return
     */
    Picture fetchPicture()

}