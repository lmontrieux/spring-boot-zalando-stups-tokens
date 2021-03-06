/**
 * Copyright (C) 2017 Zalando SE (http://tech.zalando.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zalando.secrets.spring.config;

import org.zalando.secrets.spring.SecretsProperties;

/**
 * 
 * @author jbellmann
 *
 */
public class CredentialsDirectoryNotExistsException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private final SecretsProperties secretsProperties;
    private static final String MESSAGE = "Credentials-Directory does not exists";

    public CredentialsDirectoryNotExistsException(SecretsProperties secretsProperties) {
        this.secretsProperties = secretsProperties;
    }

    public String getConfiguredCredentialsDirectory() {
        return secretsProperties.getCredentialsDirectory();
    }

    @Override
    public String getMessage() {
        return MESSAGE;
    }
}
