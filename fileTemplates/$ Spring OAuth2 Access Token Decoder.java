#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class $NAME {

    private TokenStore tokenStore;

    @Autowired
    public $NAME(@Value("${oauth2.tokenKey}") String publicKeyUrl) throws Exception {
        String publicKey = (String) new RestTemplate().getForObject(publicKeyUrl, Map.class).get("value");

        JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
        tokenConverter.setVerifierKey(publicKey);
        tokenConverter.afterPropertiesSet();

        tokenStore = new JwtTokenStore(tokenConverter);
    }

    public OAuth2AccessToken decode(String accessToken) {
        return tokenStore.readAccessToken(accessToken);
    }
}
