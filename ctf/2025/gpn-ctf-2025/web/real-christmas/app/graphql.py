from graphene import (
    InputObjectType,
    ObjectType,
    Mutation,
    Int,
    Boolean,
    Schema,
    String,
    Field,
)
from flask import current_app
from app import db
from app.models import User


class UserType(ObjectType):
    id = Int()
    email = String()
    is_active = Boolean()


class QueryRoot(ObjectType):
    class Meta:
        description = "A GraphQL query root for user operations."

    userEmail = Field(UserType, email=String(required=True))
    userId = Field(UserType, id=Int(required=True))

    def resolve_userEmail(self, info, email):
        user = User.query.filter_by(email=email).first()
        if not user:
            return None
        return UserType(
            id=user.id,
            email=user.email,
            is_active=user.is_active,
        )

    def resolve_userId(self, info, id):
        user = User.query.filter_by(id=id).first()
        if not user:
            return None
        return UserType(
            id=user.id,
            email=user.email,
            is_active=user.is_active,
        )


# Add this new input type for mutations
class UserInput(InputObjectType):
    id = Int(required=False)
    email = String(required=False)


class DeactivateUser(Mutation):
    class Meta:
        description = "Mutation to deactivate a user using a complex input object"

    class Arguments:
        user = UserInput(required=True)

    success = Boolean()
    message = String()

    def mutate(self, info, user):
        # Check if at least one identifier is provided
        if user.get("id") is None and user.get("email") is None:
            return DeactivateUser(
                success=False,
                message="Either id or email must be provided in user object",
            )

        # Find the user
        db_user = None
        if user.get("id") is not None:
            db_user = User.query.filter_by(id=user.get("id")).first()
        elif user.get("email") is not None:
            db_user = User.query.filter_by(email=user.get("email")).first()

        if not db_user:
            return DeactivateUser(success=False, message="User not found")

        db_user.is_active = False
        db.session.commit()
        return DeactivateUser(success=True, message="User deactivated successfully")


class MakeAdminUser(Mutation):
    class Meta:
        description = "Mutation to make a user an admin"

    class Arguments:
        user = UserInput(required=True)

    success = Boolean()
    message = String()

    def mutate(self, info, user):
        # Auth
        if (
            not info.context.headers.get("Key")
            == current_app.config["SERVICE_TOKEN_KEY"]
        ):
            return MakeAdminUser(success=False, message="Unauthorized")

        # Find the user
        db_user = None
        if user.get("id") is not None:
            db_user = User.query.filter_by(id=user.get("id")).first()
        elif user.get("email") is not None:
            db_user = User.query.filter_by(email=user.get("email")).first()

        if not db_user:
            return MakeAdminUser(success=False, message="User not found")

        db_user.is_admin = True
        db.session.commit()
        return MakeAdminUser(success=True, message="User made admin successfully")


class MutationRoot(ObjectType):
    deactivate_user = DeactivateUser.Field()
    make_admin_user = MakeAdminUser.Field()


schema = Schema(query=QueryRoot, mutation=MutationRoot)
