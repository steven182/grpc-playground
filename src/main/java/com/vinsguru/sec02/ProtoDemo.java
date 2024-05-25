
/*
 * @(#)SimpleProtoDemo.java
 *
 * Copyright (c) BANCO DE CHILE (Chile). All rights reserved.
 *
 * All rights to this product are owned by BANCO DE CHILE and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by BANCO DE CHILE.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */
package com.vinsguru.sec02;

import com.vinsguru.models.sec01.PersonOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SimpleProtoDemo.
 *
 * @author Stiwen Romero.
 * @version 1.0.0, 01-04-2024
 */
public class ProtoDemo {

    private static final Logger  log = LoggerFactory.getLogger(ProtoDemo.class);

    public static void main(String[] args) {

        var person = PersonOuterClass.Person.newBuilder().setName("Steven").setAge(29).build();

        log.info("{}", person);


    }
}
