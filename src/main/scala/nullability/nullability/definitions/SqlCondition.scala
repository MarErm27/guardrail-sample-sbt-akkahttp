/*
 * This file was generated by Guardrail (https://github.com/twilio/guardrail).
 * Modifications will be overwritten; instead edit the OpenAPI/Swagger spec file.
 */
package nullability.definitions
import cats.syntax.either._
import io.circe._
import io.circe.syntax._
import io.circe.generic.semiauto._
import cats.implicits._
import _root_.nullability.Implicits._
case class SqlCondition(`type`: Option[SqlConditionType] = None, conditions: Option[Vector[SqlCondition]] = None, fieldName: Option[String] = None, equality: Option[SqlConditionEqualityType] = None, fieldValue: Option[io.circe.Json] = None, v6: Option[String] = None, v7: Option[String] = None, v8: Option[String] = None, v9: Option[String] = None, v10: Option[String] = None, v11: Option[String] = None, v12: Option[String] = None, v13: Option[String] = None, v14: Option[String] = None, v15: Option[String] = None, v16: Option[String] = None, v17: Option[String] = None, v18: Option[String] = None, v19: Option[String] = None, v20: Option[String] = None, v21: Option[String] = None, v22: Option[String] = None, v23: Option[String] = None)
object SqlCondition {
  implicit val encodeSqlCondition: Encoder.AsObject[SqlCondition] = {
    val readOnlyKeys = Set[String]()
    Encoder.AsObject.instance[SqlCondition](a => JsonObject.fromIterable(Vector(("type", a.`type`.asJson), ("conditions", a.conditions.asJson), ("field_name", a.fieldName.asJson), ("equality", a.equality.asJson), ("field_value", a.fieldValue.asJson), ("v6", a.v6.asJson), ("v7", a.v7.asJson), ("v8", a.v8.asJson), ("v9", a.v9.asJson), ("v10", a.v10.asJson), ("v11", a.v11.asJson), ("v12", a.v12.asJson), ("v13", a.v13.asJson), ("v14", a.v14.asJson), ("v15", a.v15.asJson), ("v16", a.v16.asJson), ("v17", a.v17.asJson), ("v18", a.v18.asJson), ("v19", a.v19.asJson), ("v20", a.v20.asJson), ("v21", a.v21.asJson), ("v22", a.v22.asJson), ("v23", a.v23.asJson)))).mapJsonObject(_.filterKeys(key => !(readOnlyKeys contains key)))
  }
  implicit val decodeSqlCondition: Decoder[SqlCondition] = new Decoder[SqlCondition] { final def apply(c: HCursor): Decoder.Result[SqlCondition] = for (v0 <- c.downField("type").as[Option[SqlConditionType]]; v1 <- c.downField("conditions").as[Option[Vector[SqlCondition]]]; v2 <- c.downField("field_name").as[Option[String]]; v3 <- c.downField("equality").as[Option[SqlConditionEqualityType]]; v4 <- c.downField("field_value").as[Option[io.circe.Json]]; v5 <- c.downField("v6").as[Option[String]]; v6 <- c.downField("v7").as[Option[String]]; v7 <- c.downField("v8").as[Option[String]]; v8 <- c.downField("v9").as[Option[String]]; v9 <- c.downField("v10").as[Option[String]]; v10 <- c.downField("v11").as[Option[String]]; v11 <- c.downField("v12").as[Option[String]]; v12 <- c.downField("v13").as[Option[String]]; v13 <- c.downField("v14").as[Option[String]]; v14 <- c.downField("v15").as[Option[String]]; v15 <- c.downField("v16").as[Option[String]]; v16 <- c.downField("v17").as[Option[String]]; v17 <- c.downField("v18").as[Option[String]]; v18 <- c.downField("v19").as[Option[String]]; v19 <- c.downField("v20").as[Option[String]]; v20 <- c.downField("v21").as[Option[String]]; v21 <- c.downField("v22").as[Option[String]]; v22 <- c.downField("v23").as[Option[String]]) yield SqlCondition(v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22) }
}