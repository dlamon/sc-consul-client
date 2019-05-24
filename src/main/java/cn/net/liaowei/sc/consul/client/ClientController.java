package cn.net.liaowei.sc.consul.client;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LiaoWei
 */
@RestController
@RequestMapping("/client")
@Api(tags = "/client", description = "客户端控制类")
public class ClientController {
    @GetMapping("/info")
    @ApiOperation("获取客户端信息")
    public Map<String, String> getClientInfo() throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        String ip = addr.getHostAddress().toString();
        String hostName = addr.getHostName().toString();
        Map<String, String> result = new HashMap<>();
        result.put("ip", ip);
        result.put("hostName", hostName);
        return result;
    }
}
