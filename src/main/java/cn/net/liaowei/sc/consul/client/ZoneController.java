package cn.net.liaowei.sc.consul.client;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiaoWei
 */
@RestController
@RequestMapping("/zone")
@Api(tags = "/zone", description = "服务分区")
public class ZoneController {

    @Value("${zone.name}")
    private String zoneName;

    @GetMapping("/name")
    @ApiOperation("获取分区名称")
    public String getZoneName() {
        return zoneName;
    }
}
