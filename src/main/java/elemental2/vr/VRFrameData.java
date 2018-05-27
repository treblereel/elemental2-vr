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

import elemental2.core.Float32Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * WARNING !!! THIS PACKAGE WILL BE REMOVED AFTER RELEASE OF ORIGINAL ELEMENTAL2
 * <p>
 * The VRFrameData interface of the WebVR API represents all the information needed to render a single frame of a VR scene; constructed by VRDisplay.getFrameData().
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/15/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class VRFrameData {

    private VRFrameData() {

    }

    /**
     * The leftProjectionMatrix read-only property of the VRFrameData interface returns a Float32Array representing a 4x4 matrix that describes the projection to be used for the left eye’s rendering.
     * <p>
     * This value may be passed directly to WebGL’s uniformMatrix4fv function.
     * <p>
     * Important: It is highly recommended that applications use this matrix without modification. Failure to use this projection matrix when rendering may cause the presented frame to be distorted or badly aligned, resulting in varying degrees of user discomfort.
     *
     * @return A Float32Array object.
     */
    @JsProperty(name = "leftProjectionMatrix")
    public native Float32Array getLeftProjectionMatrix();


    /**
     * The leftViewMatrix read-only property of the VRFrameData interface returns a Float32Array representing a 4x4 matrix that describes the view transform to be used for the left eye’s rendering.
     * <p>
     * This value may be passed directly to WebGL’s uniformMatrix4fv function.
     * <p>
     * Important: It is highly recommended that applications use this matrix when rendering.
     *
     * @return A Float32Array object.
     */
    @JsProperty(name = "leftViewMatrix")
    public native Float32Array getLeftViewMatrix();

    /**
     * The pose read-only property of the VRFrameData interface returns the VRPose of the VRDisplay at the current VRFrameData.timestamp.
     *
     * @return A VRPose object.
     */
    @JsProperty(name = "pose")
    public native VRPose getPose();

    /**
     * The rightProjectionMatrix read-only property of the VRFrameData interface returns a Float32Array representing a 4x4 matrix that describes the projection to be used for the right eye’s rendering.
     * <p>
     * This value may be passed directly to WebGL’s uniformMatrix4fv function.
     * <p>
     * Important: It is highly recommended that applications use this matrix without modification. Failure to use this projection matrix when rendering may cause the presented frame to be distorted or badly aligned, resulting in varying degrees of user discomfort.
     *
     * @return A Float32Array object.
     */
    @JsProperty(name = "rightProjectionMatrix")
    public native Float32Array getRightProjectionMatrix();


    /**
     * The rightViewMatrix read-only property of the VRFrameData interface returns a Float32Array representing a 4x4 matrix that describes the view transform to be used for the right eye’s rendering.
     * <p>
     * This value may be passed directly to WebGL’s uniformMatrix4fv function.
     * <p>
     * Important: It is highly recommended that applications use this matrix when rendering.
     *
     * @return A Float32Array object.
     */
    @JsProperty(name = "rightViewMatrix")
    public native Float32Array getRightViewMatrix();

    /**
     * The timestamp read-only property of the VRFrameData interface returns a constantly increasing timestamp value representing the time a frame update occurred.
     * <p>
     * Timestamps are useful for determining if position state data has been updated from the hardware. Since values are monotonically increasing, they can be compared to determine the ordering of updates — newer values will always be greater than or equal to older values.
     * <p>
     * The timestamp starts at 0 the first time VRDisplay.getFrameData() is invoked for a given VRDisplay.
     * @return as double value
     */
    @JsProperty(name = "timestamp")
    public native double getTimestamp(); //TODO check it

}
