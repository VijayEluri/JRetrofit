/*
 * Copyright 2006 Ville Peurala
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jretrofit.test;

import org.jretrofit.test.reflect.ReflectTest;
import org.jretrofit.test.retrofit.AllMethodsNotImplementedExceptionTest;
import org.jretrofit.test.retrofit.RetrofitWithMethodCachingTest;
import org.jretrofit.test.retrofit.RetrofitWithoutMethodCachingTest;
import org.jretrofit.test.retrofit.RetrofitterCreationTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Ville Peurala
 */
public class AllUnitTests {
    public static Test suite() {
        TestSuite suite = new TestSuite("Test for org.jretrofit");
        //$JUnit-BEGIN$
        suite.addTestSuite(RetrofitterCreationTest.class);
        suite.addTestSuite(RetrofitWithoutMethodCachingTest.class);
        suite.addTestSuite(RetrofitWithMethodCachingTest.class);
        suite.addTestSuite(AllMethodsNotImplementedExceptionTest.class);
        suite.addTestSuite(ReflectTest.class);
        //$JUnit-END$
        return suite;
    }
}
