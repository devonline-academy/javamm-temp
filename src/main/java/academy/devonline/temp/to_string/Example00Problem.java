/*
 * Copyright (c) 2019. http://devonline.academy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package academy.devonline.temp.to_string;

/**
 * @author devonline
 * @link http://devonline.academy/javamm
 */
public final class Example00Problem {

    private Example00Problem() {
    }

    public static void main(final String[] args) {
        final Class1 class1 = new Class1("test");
        System.out.println(class1);

        final Class2 class2 = new Class2("test");
        System.out.println(class2);

        // debug
    }

    /**
     * @author devonline
     * @link http://devonline.academy/javamm
     */
    private static class Class1 {

        private final String value;

        private Class1(final String value) {
            this.value = value;
        }
    }


    /**
     * @author devonline
     * @link http://devonline.academy/javamm
     */
    private static class Class2 {

        private final String value;

        private Class2(final String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Class2{" +
                "value='" + value + '\'' +
                '}';
        }
    }
}
