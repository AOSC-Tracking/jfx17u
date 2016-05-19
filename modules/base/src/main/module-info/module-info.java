/*
 * Copyright (c) 2015, 2016, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

module javafx.base {
    requires java.desktop;
    requires jdk.jfr;

    exports javafx.beans;
    exports javafx.beans.binding;
    exports javafx.beans.property;
    exports javafx.beans.property.adapter;
    exports javafx.beans.value;
    exports javafx.collections;
    exports javafx.collections.transformation;
    exports javafx.event;
    exports javafx.util;
    exports javafx.util.converter;

    exports com.sun.javafx to
        javafx.controls,
        javafx.graphics,
        javafx.swing;
    exports com.sun.javafx.beans to
        javafx.controls,
        javafx.fxml,
        javafx.graphics;
    exports com.sun.javafx.binding to
        javafx.controls,
        javafx.graphics;
    exports com.sun.javafx.collections to
        javafx.controls,
        javafx.graphics,
        javafx.media,
        javafx.swing;
    exports com.sun.javafx.event to
        javafx.controls,
        javafx.graphics;
    exports com.sun.javafx.logging to
        javafx.graphics;
    exports com.sun.javafx.property to
        javafx.controls;
    exports com.sun.javafx.runtime to
        javafx.graphics;
}