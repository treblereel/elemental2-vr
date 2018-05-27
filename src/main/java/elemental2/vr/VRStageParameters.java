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
 * The VRStageParameters interface of the WebVR API represents the values describing the the stage area for devices that support room-scale experiences.
 * <p>
 * This interface is accessible through the VRDisplay.stageParameters property.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/15/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class VRStageParameters {


    private VRStageParameters() {

    }

    /**
     * The sittingToStandingTransform read-only property of the VRStageParameters interface contains a matrix that transforms the sitting-space view matrices of VRFrameData to standing-space.
     * <p>
     * Basically, this can be passed into your WebGL code to transform the rendered view from a sitting to standing view.
     *
     * @return A 16-element Float32Array containing the components of a 4×4 transform matrix.
     */
    @JsProperty(name = "sittingToStandingTransform")
    public native Float32Array getSittingToStandingTransform();

    /**
     * The sizeX read-only property of the VRStageParameters interface returns the width of the play-area bounds in meters.
     * <p>
     * The bounds are defined as an axis-aligned rectangle on the floor, for safety purposes. Content should not require the user to move beyond these bounds; however, it is possible for the user to ignore the bounds resulting in position values outside of this rectangle. The center of the rectangle is at (0,0,0) in standing-space coordinates.
     *
     * @return A float representing the width in meters.
     */
    @JsProperty(name = "sizeX")
    public native float getSizeX();

    /**
     * The sizeY read-only property of the VRStageParameters interface returns the depth of the play-area bounds in meters.
     * <p>
     * The bounds are defined as an axis-aligned rectangle on the floor, for safety purposes. Content should not require the user to move beyond these bounds; however, it is possible for the user to ignore the bounds resulting in position values outside of this rectangle. The center of the rectangle is at (0,0,0) in standing-space coordinates.
     *
     * @return A float representing the depth in meters.
     */
    @JsProperty(name = "sizeZ")
    public native float getSizeZ();
}
