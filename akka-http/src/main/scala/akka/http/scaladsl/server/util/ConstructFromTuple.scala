/*
 * Copyright (C) 2009-2021 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.http.scaladsl.server.util

/**
 * Constructor for instances of type `R` which can be created from a tuple of type `T`.
 */
trait ConstructFromTuple[T, R] extends (T => R)

object ConstructFromTuple extends ConstructFromTupleInstances
