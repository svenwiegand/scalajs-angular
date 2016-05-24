package com.greencatsoft.angularjs.extensions.material

import com.greencatsoft.angularjs.injectable

import scala.scalajs.js

/** @see https://material.angularjs.org/#/Theming/03_configuring_a_theme
  */
@js.native
@injectable("$mdThemingProvider")
trait ThemingProvider extends js.Object {

  def theme(name: String): Theme = js.native

  def setDefaultTheme(name: String): Unit = js.native

  def alwaysWatchTheme(watch: Boolean): Unit = js.native
}

@js.native
trait Theme extends js.Object {

  def primaryPalette(color: String): this.type = js.native

  def accentPalette(color: String): this.type = js.native

  def warnPalette(color: String): this.type = js.native

  def backgroundPalette(color: String): this.type = js.native
}
