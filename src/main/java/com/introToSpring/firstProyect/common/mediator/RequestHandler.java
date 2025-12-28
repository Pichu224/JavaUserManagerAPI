package com.introToSpring.firstProyect.common.mediator;

import com.introToSpring.firstProyect.domain.Models.User;

public interface RequestHandler<T extends Request<R>, R> {

    R handle(T request);

    Class<T> getRequestType();
}
