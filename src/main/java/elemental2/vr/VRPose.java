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
 * The VRPose interface of the WebVR API represents the state of a VR sensor at a given timestamp (which includes orientation, position, velocity, and acceleration information.)
 * <p>
 * This interface is accessible through the VRDisplay.getFrameData() methods.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/15/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class VRPose {


    private VRPose() {

    }

    /**
     * The position read-only property of the VRPose interface returns the position of the VRDisplay at the current VRPose.timestamp as a 3D vector.
     * <p>
     * The coordinate system is as follows:
     * <p>
     * Positive X is to the user’s right.
     * Positive Y is up.
     * Positive Z is behind the user.
     * Positions are measured in meters from an origin point — this point is either the position the sensor was first read at, or the position of the sensor at the point that VRDisplay.resetPose() was last called.
     *
     * @return A Float32Array, or null if the VR sensor is not able to provide position data.
     */
    @JsProperty(name = "position")
    public native Float32Array getPosition();

    /**
     * The linearVelocity read-only property of the VRPose interface returns an array representing the linear velocity vector of the VRDisplay at the current VRPose.timestamp, in meters per second.
     * <p>
     * In other words, the current velocity at which the sensor is moving along the x, y, and z axes.
     *
     * @return A Float32Array, or null if the VR sensor is not able to provide linear velocity data.
     */
    @JsProperty(name = "linearVelocity")
    public native Float32Array getLinearVelocity();

    /**
     * The linearAcceleration read-only property of the VRPose interface returns an array representing the linear acceleration vector of the VRDisplay at the current VRPose.timestamp, in meters per second per second.
     * <p>
     * In other words, the current acceleration of the sensor, along the x, y, and z axes.
     *
     * @return A Float32Array, or null if the VR sensor is not able to provide linear acceleration data.
     */
    @JsProperty(name = "linearAcceleration")
    public native Float32Array getLinearAcceleration();

    /**
     * The orientation read-only property of the VRPositionState interface returns the orientation of the sensor at the current VRPose.timestamp, as a quarternion value.
     * <p>
     * The value is a Float32Array, made up of the following values:
     * <p>
     * pitch — rotation around the X axis.
     * yaw — rotation around the Y axis.
     * roll — rotation around the Z axis.
     * w — the fourth dimension (usually 1).
     * The orientation yaw (rotation around the y axis) is relative to the initial yaw of the sensor when it was first read or the yaw of the sensor at the point that VRDisplay.resetPose() was last called.
     *
     * @return A Float32Array, or null if the VR sensor is not able to provide orientation data.
     */
    @JsProperty(name = "orientation")
    public native Float32Array getOrientation();

    /**
     * The angularVelocity read-only property of the VRPose interface returns an array representing the angular velocity vector of the VRDisplay at the current VRPose.timestamp, in radians per second.
     * <p>
     * In other words, the current velocity at which the sensor is rotating around the x, y, and z axes.
     *
     * @return A Float32Array, or null if the VR sensor is not able to provide angular velocity information.
     */
    @JsProperty(name = "angularVelocity")
    public native Float32Array getAngularVelocity();

    /**
     * The angularAcceleration read-only property of the VRPose interface returns an array representing the angular acceleration vector of the VRDisplay at the current VRPose.timestamp, in meters per second per second.
     * <p>
     * In other words, the current acceleration of the sensor's rotation around the x, y, and z axes.
     *
     * @return A Float32Array, or null if the VR sensor is not able to provide angular acceleration information.
     */
    @JsProperty(name = "angularAcceleration")
    public native Float32Array getAngularAcceleration();
}
