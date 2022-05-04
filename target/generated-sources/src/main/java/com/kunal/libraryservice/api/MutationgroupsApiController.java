package com.kunal.libraryservice.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T10:33:33.915+05:30[Asia/Calcutta]")
@Controller
@RequestMapping("${openapi.reflectoring.base-path:}")
public class MutationgroupsApiController implements MutationgroupsApi {

    private final MutationgroupsApiDelegate delegate;

    public MutationgroupsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) MutationgroupsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new MutationgroupsApiDelegate() {});
    }

    @Override
    public MutationgroupsApiDelegate getDelegate() {
        return delegate;
    }

}
