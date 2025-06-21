import requests
from flask import current_app
from datetime import datetime, timedelta, timezone


def deactivate_all_users_graphql():
    from app.models import User

    one_minute_ago = datetime.now(timezone.utc) - timedelta(seconds=10)
    users_to_deactivate = User.query.filter(
        User.is_active == True, User.registration_time <= one_minute_ago
    ).all()
    for user in users_to_deactivate:
        deactivate_user_graphql(user.email)


def deactivate_user_graphql(email):
    graphql_endpoint = current_app.config["GRAPHQL_ENDPOINT"]
    query = f"""
        mutation {{
            deactivateUser (user: {{email: "{email}"}}){{   
                success             
            }}
        }}
    """
    try:
        current_app.logger.info(
            f"Sending deactivation request for user: {email} to GraphQL endpoint."
        )
        response = requests.post(
            graphql_endpoint,
            json={"query": query, "variables": {}},
            # Just assume that this deactivation service is running on a separate server,
            # and that we get a token to access it.
            headers={
                "Key": current_app.config["SERVICE_TOKEN_KEY"],
            },
        )

        response.raise_for_status()

    except requests.exceptions.RequestException as e:
        current_app.logger.error(f"Failed to send deactivation request to GraphQL: {e}")
    except Exception as e:
        current_app.logger.error(
            f"An unexpected error occurred during user deactivation: {e}"
        )
