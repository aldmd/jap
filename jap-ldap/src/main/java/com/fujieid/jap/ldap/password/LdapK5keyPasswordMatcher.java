/*
 * Copyright (c) 2020-2040, 北京符节科技有限公司 (support@fujieid.com & https://www.fujieid.com).
 * <p>
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE 3.0;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fujieid.jap.ldap.password;

/**
 * {K5KEY}123456
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0.0
 * @since 1.0.6
 */
public class LdapK5keyPasswordMatcher implements LdapPasswordMatch {

    /**
     * Encryption password
     *
     * @param inputPassword Password entered by the user
     * @return Encrypted password
     */
    @Override
    public String encode(String inputPassword) {
        if (null == inputPassword || inputPassword.trim().length() == 0) {
            return null;
        }
        return "{K5KEY}" + inputPassword;
    }
}
