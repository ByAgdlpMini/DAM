import string

def is_valid_email_address(s):
    s = s.lower()
    parts = s.split('@')
    if len(parts) !=2:
        # Not exactly one at-sign
        return False
    allowed = set(string.ascii_lowercase + string.digits + '.-_')
    for part in parts:
        if not set(part) <= allowed:
            # Characters other than the allowed ones are found
            return False
    return True