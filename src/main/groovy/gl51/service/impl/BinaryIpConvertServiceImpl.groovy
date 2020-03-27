package gl51.service.impl

import gl51.data.Ip
import gl51.service.IpConvertService
import gl51.service.IpService

import javax.inject.Inject

class BinaryIpConvertServiceImpl implements IpConvertService {

    @Inject
    IpService ipService

    @Override
    String getAndConvertIp() {
        Ip ip = ipService.fetchIp()
    }
}
