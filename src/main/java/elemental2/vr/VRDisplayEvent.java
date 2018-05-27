/*
 *       Copyright 2018 Dmitrii Tikhomirov
 *
 *        Licensed under the Apache License, Version 2.0 (the "License");
 *        you may not use this file except in compliance with the License.
 *        You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *        Unless required by applicable law or agreed to in writing, software
 *        distributed under the License is distributed on an "AS IS" BASIS,
 *        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *        See the License for the specific language governing permissions and
 *        limitations under the License.
 */
package elemental2.vr;

import elemental2.dom.Event;
import elemental2.dom.EventInit;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * WARNING !!! THIS PACKAGE WILL BE REMOVED AFTER RELEASE OF ORIGINAL ELEMENTAL2
 * <p>
 * The VRDisplayEvent interface of the WebVR API represents represents the event object of WebVR-related events (see the list of WebVR window extensions).
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/15/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class VRDisplayEvent extends Event {

    /**
     * The reason read-only property of the VRDisplayEvent interface returns a human-readable reason why the event was fired.
     */
    private String reason;

    public VRDisplayEvent(String type, EventInit eventInitDict) {
        super(type, eventInitDict);
    }


    public VRDisplayEvent(String type) {
        super(type);

    }

    /**
     * The display read-only property of the VRDisplayEvent interface returns the VRDisplay associated with this event.
     *
     * @return A VRDisplay object.
     */
    @JsProperty(name = "display")
    public native VRDisplay getDisplay();

    /**
     * A string representing the reason why the event was fired. The available reasons are defined in the VRDisplayEventReason enum, and are as follows:
     * <p>
     * mounted — The VRDisplay has detected that the user has put it on (or it has been otherwise activated).
     * navigation — The page has been navigated to from a context that allows this page to begin presenting immediately, such as from another site that was already in VR presentation mode.
     * requested — The user agent has requested that VR presentation mode be started. This allows user agents to include a consistent UI to enter VR across diferent sites.
     * unmounted — The VRDisplay has detected that the user has taken it off (or it has been otherwise slept/put on standby).
     *
     * @return the reason
     */
    @JsProperty
    public native String getReason();

}
