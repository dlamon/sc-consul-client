package cn.net.liaowei.sc.consul.client;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiaoWei
 */
//@RestController
//@RequestMapping("/actuator")
@Api(tags = "/actuator", description = "执行器")
public class ActuatorController {
    @GetMapping("/health")
    @ApiOperation("健康检查")
    public Map<String, String> healthCheck() {
        Map<String, String> result = new HashMap<>();
        result.put("health", "OK");
        return result;
    }
}
