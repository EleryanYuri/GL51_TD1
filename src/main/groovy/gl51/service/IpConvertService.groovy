package gl51.service

import gl51.data.Ip
/**
 * Permet la conversion d'ip en string
 */
interface IpConvertService {

    /**
     * Convertie une ip en string
     * @param ip
     * @return
     */
    String getAndConvertIp()
}
