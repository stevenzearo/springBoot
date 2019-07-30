package steve.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author steve
 * @Date 2019/7/30
 * @Time 14:56
 * @Version 1.0
 */

@ServerEndpoint("webScoket/{userId}")
@Component
@Slf4j
public class WebSocketServer {
    public static Map<String, Session> sessionMap = new ConcurrentHashMap<>();
}
