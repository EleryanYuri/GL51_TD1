package gl51.service

import gl51.data.Watermark

/**
 * Permet la récuperation de watermark
 */
interface ApplyWatermarkService {

    Watermark fetchWatermark()
}