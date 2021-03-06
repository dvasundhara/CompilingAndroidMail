/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.appaholics.email.service;

/**
 * {@link EasAuthenticatorService} used with the alternative label.
 *
 * <p>Functionality wise, it's a 100% clone of {@link EasAuthenticatorService}, but in order to
 * independently disable/enable each service we need to give it a different class name.
 */
public class EasAuthenticatorServiceAlternate extends EasAuthenticatorService {

}
