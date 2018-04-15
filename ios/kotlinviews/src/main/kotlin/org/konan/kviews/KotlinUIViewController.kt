/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.konan.kviews

import kotlinx.cinterop.*
import platform.Foundation.*
import platform.UIKit.*

class JustAClass  {
    fun test() {
      print("test!")
    }
}

class KotlinViewController : UIViewController {

    constructor(aDecoder: NSCoder) : super(aDecoder)
    override fun initWithCoder(aDecoder: NSCoder) = initBy(KotlinViewController(aDecoder))

    override fun viewDidLoad() {
      super.viewDidLoad()
      addTestLabel()
    }

    fun addTestLabel() {
      /* UILabel* label = [[UILabel alloc] initWithFrame:CGRectMake(0, 0, 200, 200)];
      label.textAlignment = NSTextAlignmentCenter;
      label.numberOfLines = 2;
      label.center = self.view.center;
      label.text = _text;
      label.accessibilityIdentifier = @"TestLabel";
      [self.view addSubview:label]; */
      NSLog("addTestLabel")
    }
}
