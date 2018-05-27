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

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * WARNING !!! THIS PACKAGE WILL BE REMOVED AFTER RELEASE OF ORIGINAL ELEMENTAL2
 * <p>
 * The VRDisplayCapabilities interface of the WebVR API describes the capabilities of a VRDisplay — its features can be used to perform VR device capability tests, for example can it return position information.
 * <p>
 * This interface is accessible through the VRDisplay.capabilities property.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/15/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class VRDisplayCapabilities {

    private VRDisplayCapabilities(){

    }

    /**
     * The canPresent read-only property of the VRDisplayCapabilities interface returns a Boolean stating whether the VR display is capable of presenting content (e.g. through an HMD).
     * <p>
     * This is useful for identifying "magic window" devices that are capable of 6DoF tracking but for which VRDisplay.requestPresent() is not meaningful. If canPresent is false, calls to VRDisplay.requestPresent() will fail, and VRDisplay.getEyeParameters() will return null.
     *
     * @return boolean, if can be present
     */
    @JsProperty(name = "canPresent")
    public native boolean canPresent();

    /**
     * The hasExternalDisplay read-only property of the VRDisplayCapabilities interface returns a Boolean stating whether the VR display is separate from the device's primary display.
     *
     * @return boolean
     */
    @JsProperty(name = "hasExternalDisplay")
    public native boolean hasExternalDisplay();

    /**
     * The hasOrientation read-only property of the VRDisplayCapabilities interface returns a Boolean stating whether the VR display can track and return orientation information.
     *
     * @return boolean
     */
    @Deprecated
    @JsProperty(name = "hasOrientation")
    public native boolean hasOrientation();

    /**
     * The hasPosition read-only property of the VRDisplayCapabilities interface returns a Boolean stating whether the VR display can track and return position information.
     *
     * @return boolean
     */
    @JsProperty(name = "hasPosition")
    public native boolean hasPosition();

    /**
     * The maxLayers read-only property of the VRDisplayCapabilities interface returns a number indicating the maximum number of VRLayers that the VR display can present at once (e.g. the maximum length of the array that Display.requestPresent() can accept.)
     *
     * @return A number, which must be 1 if VRDisplayCapabilities.canPresent is true, or 0 otherwise.
     */
    @JsProperty(name = "maxLayers")
    public native int maxLayers();

}
